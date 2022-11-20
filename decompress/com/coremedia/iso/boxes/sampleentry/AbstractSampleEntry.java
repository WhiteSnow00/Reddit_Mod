// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.sampleentry;

import o9.b;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry
{
    public int dataReferenceIndex;
    
    public AbstractSampleEntry(final String s) {
        super(s);
        this.dataReferenceIndex = 1;
    }
    
    public abstract void getBox(final WritableByteChannel p0) throws IOException;
    
    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }
    
    public abstract void parse(final a p0, final ByteBuffer p1, final long p2, final b p3) throws IOException;
    
    public void setDataReferenceIndex(final int dataReferenceIndex) {
        this.dataReferenceIndex = dataReferenceIndex;
    }
}
