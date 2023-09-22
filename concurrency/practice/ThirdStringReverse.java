package concurrency.practice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThirdStringReverse {
    private static String input = "abcabcabacabcabcabcacabcbcacacbcbcbcacabar";
    private static String pattern = "bc";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("First method");
        System.out.println(input);
        System.out.println(replace(input, pattern));

        System.out.println("Second method");
        System.out.println(input);
        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> replace(
                input.substring(0, input.length()/4), pattern));
        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> replace(
                input.substring(input.length()/4, input.length()/2), pattern));
        CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(() -> replace(
                input.substring(input.length()/2, 3 * input.length()/4), pattern));
        CompletableFuture<String> completableFuture4 = CompletableFuture.supplyAsync(() -> replace(
                input.substring(3 * input.length()/4), pattern));
        CompletableFuture<String> combined = CompletableFuture.allOf(completableFuture1,completableFuture2,completableFuture3,completableFuture4).thenApply(
                ignoredVOid -> completableFuture1.join() + completableFuture2.join() + completableFuture3.join() + completableFuture4.join()
        );
        System.out.println(combined.get());
    }
    private static String replace(String input, String pattern) {
        StringBuilder stringBuilder = new StringBuilder(pattern);
        return input.replaceAll(pattern, stringBuilder.reverse().toString());
    }
}
