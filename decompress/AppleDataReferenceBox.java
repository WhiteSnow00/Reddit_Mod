// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.apple;

import ak0.n;
import o9.c;
import mk2.e;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class AppleDataReferenceBox extends AbstractFullBox
{
    public static final String TYPE = "rdrf";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;
    
    static {
        ajc$preClinit();
    }
    
    public AppleDataReferenceBox() {
        super("rdrf");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("AppleDataReferenceBox.java", (Class)AppleDataReferenceBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "long"), 63);
        ajc$tjp_1 = (a)b.f(b.e("getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = (a)b.f(b.e("getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.dataReferenceType = c0.Q(byteBuffer);
        final int e = mk2.e.E(c0.a0(byteBuffer));
        this.dataReferenceSize = e;
        this.dataReference = c0.X(byteBuffer, e);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(c.f(this.dataReferenceType));
        byteBuffer.putInt(this.dataReferenceSize);
        byteBuffer.put(at1.a.f0(this.dataReference));
    }
    
    public long getContentSize() {
        return this.dataReferenceSize + 12;
    }
    
    public String getDataReference() {
        n.x(b.b(AppleDataReferenceBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.dataReference;
    }
    
    public long getDataReferenceSize() {
        n.x(b.b(AppleDataReferenceBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.dataReferenceSize;
    }
    
    public String getDataReferenceType() {
        n.x(b.b(AppleDataReferenceBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.dataReferenceType;
    }
}
