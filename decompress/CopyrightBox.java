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

public class CopyrightBox extends AbstractFullBox
{
    public static final String TYPE = "cprt";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private String copyright;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public CopyrightBox() {
        super("cprt");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("CopyrightBox.java", (Class)CopyrightBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = (a)b.f(b.e("getCopyright", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = (a)b.f(b.e("setCopyright", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "copyright", "", "void"), 58);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 81);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = c0.U(byteBuffer);
        this.copyright = c0.W(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        ah.a.l0(this.language, byteBuffer);
        m.A(this.copyright, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.copyright) + 7;
    }
    
    public String getCopyright() {
        n.x(b.b(CopyrightBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.copyright;
    }
    
    public String getLanguage() {
        n.x(b.b(CopyrightBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setCopyright(final String copyright) {
        n.x(b.c(CopyrightBox.ajc$tjp_3, (Object)this, (Object)this, (Object)copyright));
        this.copyright = copyright;
    }
    
    public void setLanguage(final String language) {
        n.x(b.c(CopyrightBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(CopyrightBox.ajc$tjp_4, (Object)this, (Object)this), "CopyrightBox[language=");
        q.append(this.getLanguage());
        q.append(";copyright=");
        q.append(this.getCopyright());
        q.append("]");
        return q.toString();
    }
}
