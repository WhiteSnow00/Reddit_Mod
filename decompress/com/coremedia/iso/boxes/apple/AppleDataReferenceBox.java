// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.apple;

import dg.l0;
import px0.c;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class AppleDataReferenceBox extends AbstractFullBox
{
    public static final String TYPE = "rdrf";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;
    
    static {
        ajc$preClinit();
    }
    
    public AppleDataReferenceBox() {
        super("rdrf");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("AppleDataReferenceBox.java", (Class)AppleDataReferenceBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "long"), 63);
        ajc$tjp_1 = (a)b.f(b.e("getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = (a)b.f(b.e("getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.dataReferenceType = xd.a.J0(byteBuffer);
        final int d2 = c.D2(xd.a.U0(byteBuffer));
        this.dataReferenceSize = d2;
        this.dataReference = xd.a.R0(byteBuffer, d2);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(o9.c.d(this.dataReferenceType));
        byteBuffer.putInt(this.dataReferenceSize);
        byteBuffer.put(l0.Z(this.dataReference));
    }
    
    public long getContentSize() {
        return this.dataReferenceSize + 12;
    }
    
    public String getDataReference() {
        m5.a.s(b.b(AppleDataReferenceBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.dataReference;
    }
    
    public long getDataReferenceSize() {
        m5.a.s(b.b(AppleDataReferenceBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.dataReferenceSize;
    }
    
    public String getDataReferenceType() {
        m5.a.s(b.b(AppleDataReferenceBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.dataReferenceType;
    }
}
