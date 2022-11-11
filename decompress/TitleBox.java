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

public class TitleBox extends AbstractFullBox
{
    public static final String TYPE = "titl";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private String language;
    private String title;
    
    static {
        ajc$preClinit();
    }
    
    public TitleBox() {
        super("titl");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("TitleBox.java", (Class)TitleBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = (a)b.f(b.e("getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", "", "void"), 59);
        ajc$tjp_3 = (a)b.f(b.e("setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", "void"), 63);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 86);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = c0.U(byteBuffer);
        this.title = c0.W(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        ah.a.l0(this.language, byteBuffer);
        m.A(this.title, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.title) + 7;
    }
    
    public String getLanguage() {
        n.x(b.b(TitleBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public String getTitle() {
        n.x(b.b(TitleBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.title;
    }
    
    public void setLanguage(final String language) {
        n.x(b.c(TitleBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public void setTitle(final String title) {
        n.x(b.c(TitleBox.ajc$tjp_3, (Object)this, (Object)this, (Object)title));
        this.title = title;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(TitleBox.ajc$tjp_4, (Object)this, (Object)this), "TitleBox[language=");
        q.append(this.getLanguage());
        q.append(";title=");
        q.append(this.getTitle());
        q.append("]");
        return q.toString();
    }
}
