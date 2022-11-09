// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.BasicContainer;
import java.util.List;
import java.util.Iterator;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MovieBox extends AbstractContainerBox
{
    public static final String TYPE = "moov";
    
    public MovieBox() {
        super("moov");
    }
    
    public MovieHeaderBox getMovieHeaderBox() {
        for (final Box box : ((BasicContainer)this).getBoxes()) {
            if (box instanceof MovieHeaderBox) {
                return (MovieHeaderBox)box;
            }
        }
        return null;
    }
    
    public int getTrackCount() {
        return ((BasicContainer)this).getBoxes((Class)TrackBox.class).size();
    }
    
    public long[] getTrackNumbers() {
        final List boxes = ((BasicContainer)this).getBoxes((Class)TrackBox.class);
        final long[] array = new long[boxes.size()];
        for (int i = 0; i < boxes.size(); ++i) {
            array[i] = ((TrackBox)boxes.get(i)).getTrackHeaderBox().getTrackId();
        }
        return array;
    }
}
