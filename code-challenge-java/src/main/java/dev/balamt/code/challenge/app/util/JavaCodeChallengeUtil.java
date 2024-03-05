package dev.balamt.code.challenge.app.util;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.text.TextContentRenderer;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class JavaCodeChallengeUtil {

    static Logger logger = Logger.getLogger(JavaCodeChallengeUtil.class.getName());

    private JavaCodeChallengeUtil() {
    }
    public static void printLine(Object... msg) {
        StringBuilder sb = new StringBuilder();
        for (Object line : msg
        ) {
            sb.append(line);
            sb.append("\t");
        }
        System.out.println(sb);
    }

    public static void print(Object... msg) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (Object line : msg
        ) {
            sb.append(line);
            sb.append("\t");
            index++;
            if(index == msg.length){
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void printDoc(Class className) {
        String packagePath = className.getPackageName().replace(".", "/");
        String docFileName = className.getSimpleName();
        System.out.println(("Opened the File /" + packagePath + "/" + docFileName + ".md") + "\n");

        try {
            InputStream docFile = new ByteArrayInputStream(Class.forName(className.getPackageName() + "." + className.getSimpleName()).getResourceAsStream(docFileName + ".md").readAllBytes());
            String content = new String(docFile.readAllBytes(), StandardCharsets.UTF_8);
            MdFileParser.parse(content);
            //System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("End of File " + packagePath + "/" + docFileName +".md\n");
    }

}

class MdFileParser {

    public static void parse(String fileContent){
        Parser parser = Parser.builder().build();
        Node document = parser.parse(fileContent);

        // Render the text content
        TextContentRenderer renderer = TextContentRenderer.builder().build();
        JavaCodeChallengeUtil.print(renderer.render(document));
    }
}