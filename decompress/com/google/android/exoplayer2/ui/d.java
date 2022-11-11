// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import java.util.ArrayList;
import yb.e;
import java.util.Map;
import android.text.Html;
import java.util.regex.Pattern;

public final class d
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("(&#13;)?&#10;");
    }
    
    public static String a(final CharSequence charSequence) {
        return d.a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
    
    public static final class a
    {
        public final String a;
        public final Map<String, String> b;
        
        public a(final String a, final Map b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public static final e2.d e;
        public static final e f;
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        
        static {
            e = new e2.d(6);
            f = new e(4);
        }
        
        public b(final int a, final int b, final String c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class c
    {
        public final ArrayList a;
        public final ArrayList b;
        
        public c() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }
    }
}
