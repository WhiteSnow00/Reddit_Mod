// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class GenreBox extends AbstractFullBox
{
    public static final String TYPE = "gnre";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private String genre;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public GenreBox() {
        super("gnre");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("GenreBox.java", (Class)GenreBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = (a)b.f(b.e("getGenre", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = (a)b.f(b.e("setGenre", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "genre", "", "void"), 54);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 77);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.genre = xd.a.Q0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.genre, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.s1(this.genre) + 7;
    }
    
    public String getGenre() {
        m5.a.s(b.b(GenreBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.genre;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(GenreBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setGenre(final String genre) {
        m5.a.s(b.c(GenreBox.ajc$tjp_3, (Object)this, (Object)this, (Object)genre));
        this.genre = genre;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(GenreBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(GenreBox.ajc$tjp_4, (Object)this, (Object)this), "GenreBox[language=");
        p.append(this.getLanguage());
        p.append(";genre=");
        p.append(this.getGenre());
        p.append("]");
        return p.toString();
    }
}
