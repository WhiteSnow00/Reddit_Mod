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

public class DescriptionBox extends AbstractFullBox
{
    public static final String TYPE = "dscp";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private String description;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public DescriptionBox() {
        super("dscp");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("DescriptionBox.java", (Class)DescriptionBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = (a)b.f(b.e("getDescription", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "language", "", "void"), 71);
        ajc$tjp_4 = (a)b.f(b.e("setDescription", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "description", "", "void"), 75);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = c0.U(byteBuffer);
        this.description = c0.W(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        ah.a.l0(this.language, byteBuffer);
        m.A(this.description, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.description) + 7;
    }
    
    public String getDescription() {
        n.x(b.b(DescriptionBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.description;
    }
    
    public String getLanguage() {
        n.x(b.b(DescriptionBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setDescription(final String description) {
        n.x(b.c(DescriptionBox.ajc$tjp_4, (Object)this, (Object)this, (Object)description));
        this.description = description;
    }
    
    public void setLanguage(final String language) {
        n.x(b.c(DescriptionBox.ajc$tjp_3, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(DescriptionBox.ajc$tjp_2, (Object)this, (Object)this), "DescriptionBox[language=");
        q.append(this.getLanguage());
        q.append(";description=");
        q.append(this.getDescription());
        q.append("]");
        return q.toString();
    }
}
