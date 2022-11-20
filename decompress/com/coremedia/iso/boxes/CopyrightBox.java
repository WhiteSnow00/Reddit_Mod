// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class CopyrightBox extends AbstractFullBox
{
    public static final String TYPE = "cprt";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private String copyright;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public CopyrightBox() {
        super("cprt");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("CopyrightBox.java", (Class)CopyrightBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = (a)b.f(b.e("getCopyright", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = (a)b.f(b.e("setCopyright", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "copyright", "", "void"), 58);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 81);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.copyright = xd.a.Q0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.copyright, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.s1(this.copyright) + 7;
    }
    
    public String getCopyright() {
        m5.a.s(b.b(CopyrightBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.copyright;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(CopyrightBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setCopyright(final String copyright) {
        m5.a.s(b.c(CopyrightBox.ajc$tjp_3, (Object)this, (Object)this, (Object)copyright));
        this.copyright = copyright;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(CopyrightBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(CopyrightBox.ajc$tjp_4, (Object)this, (Object)this), "CopyrightBox[language=");
        p.append(this.getLanguage());
        p.append(";copyright=");
        p.append(this.getCopyright());
        p.append("]");
        return p.toString();
    }
}
