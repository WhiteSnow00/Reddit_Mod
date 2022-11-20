// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.BasicContainer;
import java.util.Iterator;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.AbstractContainerBox;

public class TrackFragmentBox extends AbstractContainerBox
{
    public static final String TYPE = "traf";
    
    public TrackFragmentBox() {
        super("traf");
    }
    
    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox)box;
            }
        }
        return null;
    }
}
