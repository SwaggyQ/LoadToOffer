package com.sugu.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: create by sugu
 * @date:2019/8/1
 * @link:
 */
public class FIleIO {
    public static void main(String[] args) {
        try(Stream<String> stream = Files.lines(Paths.get("/Users/sugu/Documents/filter.log"))){
            stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream().map(e -> e.getValue() + " " + e.getKey())
                    .filter(s -> s.contains("Login"))
                    .sorted((a,b) -> -a.compareTo(b)).forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
