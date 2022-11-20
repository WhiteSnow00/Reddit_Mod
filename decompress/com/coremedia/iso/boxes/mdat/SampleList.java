// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.boxes.Container;
import sj.a;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.Box;
import o9.c;
import com.coremedia.iso.boxes.TrackBox;
import java.util.List;
import qj.f;
import java.util.AbstractList;

public class SampleList extends AbstractList<f>
{
    public List<f> samples;
    
    public SampleList(final TrackBox trackBox, final c... array) {
        final Container parent = ((Box)trackBox.getParent()).getParent();
        if (trackBox.getParent().getBoxes(MovieExtendsBox.class).isEmpty()) {
            if (array.length > 0) {
                throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
            }
            this.samples = (List<f>)new a(trackBox.getTrackHeaderBox().getTrackId(), parent);
        }
        else {
            this.samples = (List<f>)new sj.c(trackBox.getTrackHeaderBox().getTrackId(), parent, array);
        }
    }
    
    @Override
    public /* bridge */ Object get(final int n) {
        return this.get(n);
    }
    
    @Override
    public f get(final int n) {
        return this.samples.get(n);
    }
    
    @Override
    public int size() {
        return this.samples.size();
    }
}
