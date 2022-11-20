// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import dg.l0;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class XmlBox extends AbstractFullBox
{
    public static final String TYPE = "xml ";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    public String xml;
    
    static {
        ajc$preClinit();
    }
    
    public XmlBox() {
        super("xml ");
        this.xml = "";
    }
    
    private static void ajc$preClinit() {
        final b b = new b("XmlBox.java", (Class)XmlBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getXml", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 20);
        ajc$tjp_1 = (a)b.f(b.e("setXml", "com.coremedia.iso.boxes.XmlBox", "java.lang.String", "xml", "", "void"), 24);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 46);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.xml = xd.a.R0(byteBuffer, byteBuffer.remaining());
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(l0.Z(this.xml));
    }
    
    public long getContentSize() {
        return l0.s1(this.xml) + 4;
    }
    
    public String getXml() {
        m5.a.s(b.b(XmlBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.xml;
    }
    
    public void setXml(final String xml) {
        m5.a.s(b.c(XmlBox.ajc$tjp_1, (Object)this, (Object)this, (Object)xml));
        this.xml = xml;
    }
    
    public String toString() {
        return d.m(b.p(b.b(XmlBox.ajc$tjp_2, (Object)this, (Object)this), "XmlBox{xml='"), this.xml, '\'', '}');
    }
}
