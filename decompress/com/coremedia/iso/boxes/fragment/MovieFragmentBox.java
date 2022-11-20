// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.BasicContainer;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.googlecode.mp4parser.a;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MovieFragmentBox extends AbstractContainerBox
{
    public static final String TYPE = "moof";
    
    public MovieFragmentBox() {
        super("moof");
    }
    
    public a getFileChannel() {
        return ((BasicContainer)this).dataSource;
    }
    
    public List<Long> getSyncSamples(final SampleDependencyTypeBox sampleDependencyTypeBox) {
        final ArrayList list = new ArrayList();
        final Iterator<SampleDependencyTypeBox.Entry> iterator = sampleDependencyTypeBox.getEntries().iterator();
        long n = 1L;
        while (iterator.hasNext()) {
            if (((SampleDependencyTypeBox.Entry)iterator.next()).getSampleDependsOn() == 2) {
                list.add(n);
            }
            ++n;
        }
        return list;
    }
    
    public int getTrackCount() {
        return ((BasicContainer)this).getBoxes((Class)TrackFragmentBox.class, false).size();
    }
    
    public List<TrackFragmentHeaderBox> getTrackFragmentHeaderBoxes() {
        return ((BasicContainer)this).getBoxes((Class)TrackFragmentHeaderBox.class, true);
    }
    
    public long[] getTrackNumbers() {
        int i = 0;
        final List boxes = ((BasicContainer)this).getBoxes((Class)TrackFragmentBox.class, false);
        final long[] array = new long[boxes.size()];
        while (i < boxes.size()) {
            array[i] = boxes.get(i).getTrackFragmentHeaderBox().getTrackId();
            ++i;
        }
        return array;
    }
    
    public List<TrackRunBox> getTrackRunBoxes() {
        return ((BasicContainer)this).getBoxes((Class)TrackRunBox.class, true);
    }
}
