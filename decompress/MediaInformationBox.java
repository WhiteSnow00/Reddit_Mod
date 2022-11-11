// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.BasicContainer;
import java.util.Iterator;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MediaInformationBox extends AbstractContainerBox
{
    public static final String TYPE = "minf";
    
    public MediaInformationBox() {
        super("minf");
    }
    
    public AbstractMediaHeaderBox getMediaHeaderBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof AbstractMediaHeaderBox) {
                return (AbstractMediaHeaderBox)box;
            }
        }
        return null;
    }
    
    public SampleTableBox getSampleTableBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof SampleTableBox) {
                return (SampleTableBox)box;
            }
        }
        return null;
    }
}
