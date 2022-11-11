// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import ak0.m;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class GenreBox extends AbstractFullBox
{
    public static final String TYPE = "gnre";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private String genre;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public GenreBox() {
        super("gnre");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("GenreBox.java", (Class)GenreBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = (a)b.f(b.e("getGenre", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = (a)b.f(b.e("setGenre", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "genre", "", "void"), 54);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 77);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = c0.U(byteBuffer);
        this.genre = c0.W(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        ah.a.l0(this.language, byteBuffer);
        m.A(this.genre, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.genre) + 7;
    }
    
    public String getGenre() {
        n.x(b.b(GenreBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.genre;
    }
    
    public String getLanguage() {
        n.x(b.b(GenreBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setGenre(final String genre) {
        n.x(b.c(GenreBox.ajc$tjp_3, (Object)this, (Object)this, (Object)genre));
        this.genre = genre;
    }
    
    public void setLanguage(final String language) {
        n.x(b.c(GenreBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(GenreBox.ajc$tjp_4, (Object)this, (Object)this), "GenreBox[language=");
        q.append(this.getLanguage());
        q.append(";genre=");
        q.append(this.getGenre());
        q.append("]");
        return q.toString();
    }
}
