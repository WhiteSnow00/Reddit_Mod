// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TitleBox extends AbstractFullBox
{
    public static final String TYPE = "titl";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private String language;
    private String title;
    
    static {
        ajc$preClinit();
    }
    
    public TitleBox() {
        super("titl");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TitleBox.java", (Class)TitleBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = (a)b.f(b.e("getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", "", "void"), 59);
        ajc$tjp_3 = (a)b.f(b.e("setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", "void"), 63);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 86);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.title = xd.a.Q0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.title, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.s1(this.title) + 7;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(TitleBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public String getTitle() {
        m5.a.s(b.b(TitleBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.title;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(TitleBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public void setTitle(final String title) {
        m5.a.s(b.c(TitleBox.ajc$tjp_3, (Object)this, (Object)this, (Object)title));
        this.title = title;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(TitleBox.ajc$tjp_4, (Object)this, (Object)this), "TitleBox[language=");
        p.append(this.getLanguage());
        p.append(";title=");
        p.append(this.getTitle());
        p.append("]");
        return p.toString();
    }
}
