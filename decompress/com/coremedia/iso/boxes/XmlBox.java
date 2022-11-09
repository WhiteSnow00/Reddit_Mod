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

public class XmlBox extends AbstractFullBox
{
    public static final String TYPE = "xml ";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    public String xml;
    
    static {
        ajc$preClinit();
    }
    
    public XmlBox() {
        super("xml ");
        this.xml = "";
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("XmlBox.java", (Class)XmlBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getXml", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 20);
        ajc$tjp_1 = (a)b.f(b.e("setXml", "com.coremedia.iso.boxes.XmlBox", "java.lang.String", "xml", "", "void"), 24);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 46);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.xml = c0.X(byteBuffer, byteBuffer.remaining());
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(at1.a.f0(this.xml));
    }
    
    public long getContentSize() {
        return at1.a.m2(this.xml) + 4;
    }
    
    public String getXml() {
        n.x(b.b(XmlBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.xml;
    }
    
    public void setXml(final String xml) {
        n.x(b.c(XmlBox.ajc$tjp_1, (Object)this, (Object)this, (Object)xml));
        this.xml = xml;
    }
    
    public String toString() {
        return m.m(ag0.a.q(b.b(XmlBox.ajc$tjp_2, (Object)this, (Object)this), "XmlBox{xml='"), this.xml, '\'', '}');
    }
}
