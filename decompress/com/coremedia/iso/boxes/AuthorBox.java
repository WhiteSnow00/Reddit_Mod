// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.m;
import ak0.n;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class AuthorBox extends AbstractFullBox
{
    public static final String TYPE = "auth";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private String author;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public AuthorBox() {
        super("auth");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("AuthorBox.java", (Class)AuthorBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.AuthorBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = (a)b.f(b.e("getAuthor", "com.coremedia.iso.boxes.AuthorBox", "", "", "", "java.lang.String"), 60);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.AuthorBox", "java.lang.String", "language", "", "void"), 64);
        ajc$tjp_3 = (a)b.f(b.e("setAuthor", "com.coremedia.iso.boxes.AuthorBox", "java.lang.String", "author", "", "void"), 68);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.AuthorBox", "", "", "", "java.lang.String"), 92);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = c0.U(byteBuffer);
        this.author = c0.W(byteBuffer);
    }
    
    public String getAuthor() {
        n.x(b.b(AuthorBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.author;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        ah.a.l0(this.language, byteBuffer);
        m.A(this.author, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.author) + 7;
    }
    
    public String getLanguage() {
        n.x(b.b(AuthorBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setAuthor(final String author) {
        n.x(b.c(AuthorBox.ajc$tjp_3, (Object)this, (Object)this, (Object)author));
        this.author = author;
    }
    
    public void setLanguage(final String language) {
        n.x(b.c(AuthorBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(AuthorBox.ajc$tjp_4, (Object)this, (Object)this), "AuthorBox[language=");
        q.append(this.getLanguage());
        q.append(";author=");
        q.append(this.getAuthor());
        q.append("]");
        return q.toString();
    }
}
