// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.BasicContainer;
import java.util.List;
import java.util.Iterator;
import com.googlecode.mp4parser.AbstractContainerBox;

public class TrackBox extends AbstractContainerBox
{
    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;
    
    public TrackBox() {
        super("trak");
    }
    
    public MediaBox getMediaBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof MediaBox) {
                return (MediaBox)box;
            }
        }
        return null;
    }
    
    public SampleTableBox getSampleTableBox() {
        final SampleTableBox sampleTableBox = this.sampleTableBox;
        if (sampleTableBox != null) {
            return sampleTableBox;
        }
        final MediaBox mediaBox = this.getMediaBox();
        if (mediaBox != null) {
            final MediaInformationBox mediaInformationBox = mediaBox.getMediaInformationBox();
            if (mediaInformationBox != null) {
                return this.sampleTableBox = mediaInformationBox.getSampleTableBox();
            }
        }
        return null;
    }
    
    public TrackHeaderBox getTrackHeaderBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof TrackHeaderBox) {
                return (TrackHeaderBox)box;
            }
        }
        return null;
    }
    
    public void setBoxes(final List<Box> boxes) {
        super.setBoxes((List)boxes);
        this.sampleTableBox = null;
    }
}
