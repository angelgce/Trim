package org.example;

public final class MyTrim {
    private MyTrim() {

    }

    public static String trim(String string) {
        while (string.startsWith(" ") || string.endsWith(" ")) {
            string = removeWhitespace(string);
        }
        System.out.println(string);
        return string;
    }

    private static String removeWhitespace(String string) {
        String[] split = string.split("");
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            //ignoring first whitespace
            if (i == 0 && !split[i].equals(" ")) out.append(split[i]);
            //body
            if (i > 0 && i < split.length - 1) out.append(split[i]);
            //ignoring last whitespace
            if (i == split.length - 1 && !split[i].equals(" ")) out.append(split[i]);
        }
        return out.toString();
    }
}
