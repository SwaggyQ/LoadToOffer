package com.sugu.solution.unnamed;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: create by sugu
 * @date:2019/7/26
 * @link:
 */
public class Java8Demo {
    private static String[] strings = {"a", "b", "c", "c", "d", "e"};
    private static List<String> list = Arrays.asList(strings);
    private static Stream<String> stream = Stream.of(strings);

    private static String listWay(List<String> list) {
        String result = null;
        for (String s : list) {
            System.out.println("list+" + s);
            if (s.equals("c")) {
                System.out.println("done!");
                result = "c";
                break;
            }
        }
        return result;
    }

    private static String streamWay(Stream<String> stream) {
        return stream.peek(s1 -> System.out.println("stream+" + s1))
                .filter(s -> s.equals("c"))
                .peek(s2 -> System.out.println("done!"))
                .findFirst().orElse(null);

    }

    public static void main(String[] args){
        streamWay(stream);
//        List<Ball> balls = Ball.randomBall(100);
//        System.out.println(legendWay(balls));
//        System.out.println(java8Way(balls));
//        System.out.println(streamWay(balls));
    }
    ///////////////////

    public static int listWayCount(List<Ball> balls, String color){
        int count=0;
        for(Ball ball : balls){
            if(ball.getColor().equals(color)){
                count++;
            }
        }
        return count;
    }

    public static int streamWayCount(List<Ball> balls, String color){
        return (int) balls.stream().map(Ball::getColor)
                .filter(s -> s.equals(color))
                .count();
    }

    ///////////////////

    public static Map<String, Float> legendWay(List<Ball> balls) {
        Map<String, Float> result = new HashMap<>();
        for(Ball ball : balls){
            if(!result.containsKey(ball.getColor())){
                result.put(ball.getColor(), 0f);
            }
            result.put(ball.getColor(),result.get(ball.getColor())+ball.getWeight());
        }
        return result;
    }

    public static Map<String, Float> java8Way(List<Ball> balls) {
        Map<String, Float> result = new HashMap<>();
        for (Ball ball : balls) {
            result.putIfAbsent(ball.getColor(), 0f);
            result.merge(ball.getColor(), ball.getWeight(), (acc, element) -> acc + element);
        }
        return result;
    }

    public static Map<String, Float> streamWay(List<Ball> balls) {
        Map<String, Float> result = new HashMap<>();
        balls.stream().collect(Collectors.groupingBy(Ball::getColor))
                .forEach((k, v) -> result.put(k, v.stream()
                        .map(Ball::getWeight)
                        .reduce(0f, ((acc, element) -> acc + element))));
        return result;
    }


}


class Ball {
    private static final String[] colors = {"red", "blue", "green", "yellow", "pink", "pepper"};
    private static Random r = new Random();
    private String color;
    private float weight;

    private Ball() {
    }

    private Ball(String color,float weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public static List<Ball> randomBall(int number) {
        List<Ball> balls = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            Ball ball = new Ball(colors[r.nextInt(colors.length)],1f+r.nextFloat()/10f-0.05f);
            balls.add(ball);
        }
        return balls;
    }
}