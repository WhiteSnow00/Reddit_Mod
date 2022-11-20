// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class DescriptionBox extends AbstractFullBox
{
    public static final String TYPE = "dscp";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private String description;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public DescriptionBox() {
        super("dscp");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("DescriptionBox.java", (Class)DescriptionBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = (a)b.f(b.e("getDescription", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "language", "", "void"), 71);
        ajc$tjp_4 = (a)b.f(b.e("setDescription", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "description", "", "void"), 75);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.description = xd.a.Q0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.description, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.s1(this.description) + 7;
    }
    
    public String getDescription() {
        m5.a.s(b.b(DescriptionBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.description;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(DescriptionBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setDescription(final String description) {
        m5.a.s(b.c(DescriptionBox.ajc$tjp_4, (Object)this, (Object)this, (Object)description));
        this.description = description;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(DescriptionBox.ajc$tjp_3, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(DescriptionBox.ajc$tjp_2, (Object)this, (Object)this), "DescriptionBox[language=");
        p.append(this.getLanguage());
        p.append(";description=");
        p.append(this.getDescription());
        p.append("]");
        return p.toString();
    }
}
