// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.BasicContainer;
import java.util.Iterator;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MediaBox extends AbstractContainerBox
{
    public static final String TYPE = "mdia";
    
    public MediaBox() {
        super("mdia");
    }
    
    public HandlerBox getHandlerBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof HandlerBox) {
                return (HandlerBox)box;
            }
        }
        return null;
    }
    
    public MediaHeaderBox getMediaHeaderBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof MediaHeaderBox) {
                return (MediaHeaderBox)box;
            }
        }
        return null;
    }
    
    public MediaInformationBox getMediaInformationBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof MediaInformationBox) {
                return (MediaInformationBox)box;
            }
        }
        return null;
    }
}
