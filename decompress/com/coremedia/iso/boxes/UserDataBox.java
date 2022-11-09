// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import o9.b;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class UserDataBox extends AbstractContainerBox
{
    public static final String TYPE = "udta";
    
    public UserDataBox() {
        super("udta");
    }
    
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }
    
    public void parse(final a a, final ByteBuffer byteBuffer, final long n, final b b) throws IOException {
        super.parse(a, byteBuffer, n, b);
    }
}
