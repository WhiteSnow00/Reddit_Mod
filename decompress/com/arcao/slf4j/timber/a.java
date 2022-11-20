// 
// Decompiled by Procyon v0.6.0
// 

package com.arcao.slf4j.timber;

import java.util.regex.Matcher;
import ot2.b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public final class a implements ot2.a
{
    public static final Pattern g;
    public final ConcurrentHashMap f;
    
    static {
        g = Pattern.compile("\\$\\d+$");
    }
    
    public a() {
        this.f = new ConcurrentHashMap();
    }
    
    public final b c(String replaceAll) {
        final Matcher matcher = a.g.matcher(replaceAll);
        if (matcher.find()) {
            replaceAll = matcher.replaceAll("");
        }
        final String substring = replaceAll.substring(replaceAll.lastIndexOf(46) + 1);
        Object o;
        if ((o = this.f.get(substring)) == null) {
            o = new TimberLoggerAdapter(substring);
            final b b = this.f.putIfAbsent(substring, o);
            if (b != null) {
                o = b;
            }
        }
        return (b)o;
    }
}
