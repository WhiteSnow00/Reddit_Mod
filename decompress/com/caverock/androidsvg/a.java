// 
// Decompiled by Procyon v0.6.0
// 

package com.caverock.androidsvg;

public final class a
{
    public CSSParser.m a;
    public PreserveAspectRatio b;
    public SVG.b c;
    public String d;
    public SVG.b e;
    
    public a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
    
    public a(final a a) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        if (a == null) {
            return;
        }
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
    }
    
    public final void a(final String s) {
        final CSSParser cssParser = new CSSParser(CSSParser$MediaType.screen, CSSParser$Source.RenderOptions);
        final CSSParser.CSSParser$c cssParser$c = new CSSParser$c(s);
        ((SVGParser.g)cssParser$c).q();
        this.a = cssParser.e(cssParser$c);
    }
}
