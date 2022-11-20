// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox
{
    public static final String TYPE = "odaf";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;
    
    static {
        ajc$preClinit();
    }
    
    public OmaDrmAccessUnitFormatBox() {
        super("odaf");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("OmaDrmAccessUnitFormatBox.java", (Class)OmaDrmAccessUnitFormatBox.class);
        ajc$tjp_0 = (a)b.f(b.e("isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "boolean"), 46);
        ajc$tjp_1 = (a)b.f(b.e("getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 50);
        ajc$tjp_2 = (a)b.f(b.e("getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 54);
        ajc$tjp_3 = (a)b.f(b.e("setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"), 58);
        ajc$tjp_4 = (a)b.f(b.e("setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"), 62);
        ajc$tjp_5 = (a)b.f(b.e("setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"), 66);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        int value;
        final byte b = (byte)(value = byteBuffer.get());
        if (b < 0) {
            value = b + 256;
        }
        final byte allBits = (byte)value;
        this.allBits = allBits;
        this.selectiveEncryption = ((allBits & 0x80) == 0x80);
        final byte value2 = byteBuffer.get();
        int keyIndicatorLength;
        if ((keyIndicatorLength = value2) < 0) {
            keyIndicatorLength = value2 + 256;
        }
        this.keyIndicatorLength = keyIndicatorLength;
        final byte value3 = byteBuffer.get();
        int initVectorLength;
        if ((initVectorLength = value3) < 0) {
            initVectorLength = value3 + 256;
        }
        this.initVectorLength = initVectorLength;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put((byte)(this.allBits & 0xFF));
        byteBuffer.put((byte)(this.keyIndicatorLength & 0xFF));
        byteBuffer.put((byte)(this.initVectorLength & 0xFF));
    }
    
    public long getContentSize() {
        return 7L;
    }
    
    public int getInitVectorLength() {
        m5.a.s(b.b(OmaDrmAccessUnitFormatBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.initVectorLength;
    }
    
    public int getKeyIndicatorLength() {
        m5.a.s(b.b(OmaDrmAccessUnitFormatBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.keyIndicatorLength;
    }
    
    public boolean isSelectiveEncryption() {
        m5.a.s(b.b(OmaDrmAccessUnitFormatBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.selectiveEncryption;
    }
    
    public void setAllBits(final byte allBits) {
        m5.a.s(b.c(OmaDrmAccessUnitFormatBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Byte(allBits)));
        this.allBits = allBits;
        this.selectiveEncryption = ((allBits & 0x80) == 0x80);
    }
    
    public void setInitVectorLength(final int initVectorLength) {
        m5.a.s(b.c(OmaDrmAccessUnitFormatBox.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(initVectorLength)));
        this.initVectorLength = initVectorLength;
    }
    
    public void setKeyIndicatorLength(final int keyIndicatorLength) {
        m5.a.s(b.c(OmaDrmAccessUnitFormatBox.ajc$tjp_4, (Object)this, (Object)this, (Object)new Integer(keyIndicatorLength)));
        this.keyIndicatorLength = keyIndicatorLength;
    }
}
