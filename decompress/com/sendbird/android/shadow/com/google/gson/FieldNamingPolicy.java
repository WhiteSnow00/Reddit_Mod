// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.com.google.gson;

import java.lang.reflect.Field;

public enum FieldNamingPolicy
{
    IDENTITY("IDENTITY", 0), 
    LOWER_CASE_WITH_DASHES("LOWER_CASE_WITH_DASHES", 4), 
    LOWER_CASE_WITH_DOTS("LOWER_CASE_WITH_DOTS", 5), 
    LOWER_CASE_WITH_UNDERSCORES("LOWER_CASE_WITH_UNDERSCORES", 3), 
    UPPER_CAMEL_CASE("UPPER_CAMEL_CASE", 1), 
    UPPER_CAMEL_CASE_WITH_SPACES("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    
    private static String modifyString(final char c, String s, final int n) {
        if (n < s.length()) {
            final StringBuilder p3 = d.p(c);
            p3.append(s.substring(n));
            s = p3.toString();
        }
        else {
            s = String.valueOf(c);
        }
        return s;
    }
    
    public static String separateCamelCase(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1) && sb.length() != 0) {
                sb.append(s2);
            }
            sb.append(char1);
        }
        return sb.toString();
    }
    
    public static String upperCaseFirstLetter(final String s) {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        final char char1 = s.charAt(0);
        int length;
        char char2;
        for (length = s.length(), char2 = char1; n < length - 1 && !Character.isLetter(char2); ++n, char2 = s.charAt(n)) {
            sb.append(char2);
        }
        String string = s;
        if (!Character.isUpperCase(char2)) {
            sb.append(modifyString(Character.toUpperCase(char2), s, n + 1));
            string = sb.toString();
        }
        return string;
    }
}
