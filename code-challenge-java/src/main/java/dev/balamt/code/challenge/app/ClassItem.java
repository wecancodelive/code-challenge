package dev.balamt.code.challenge.app;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClassItem implements Serializable {

    private String root;
    private List<Category> categories;
}


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Category implements Serializable {
    private String name;
    private Classes classes;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Classes implements Serializable {
    private List<String> classname;
}