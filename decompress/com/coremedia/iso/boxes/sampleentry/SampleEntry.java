// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.Box;

public interface SampleEntry extends Box, Container
{
    int getDataReferenceIndex();
    
    void setDataReferenceIndex(final int p0);
}
