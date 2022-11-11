// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import sg2.e;
import com.reddit.video.creation.video.videocreator.CompressionConfig;
import android.util.Size;
import com.reddit.video.creation.api.output.RecordedSegment;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n" }, d2 = { "toCompressionConfig", "Lcom/reddit/video/creation/video/videocreator/CompressionConfig;", "", "Lcom/reddit/video/creation/api/output/RecordedSegment;", "defaultFrameRate", "", "defaultBitRate", "iframeInteval", "defaultSize", "Landroid/util/Size;", "creation_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class RecordedSegmentsToCompressionParamsKt
{
    public static final CompressionConfig toCompressionConfig(final List<RecordedSegment> list, int intValue, int intValue2, final int n, final Size size) {
        e.f((Object)list, "<this>");
        e.f((Object)size, "defaultSize");
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Integer bitRate = iterator.next().getBitRate();
            if (bitRate != null) {
                list2.add(bitRate);
            }
        }
        final Integer n2 = (Integer)CollectionsKt___CollectionsKt.P3(list2);
        if (n2 != null) {
            intValue2 = n2;
        }
        final ArrayList<Integer> list3 = new ArrayList<Integer>();
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Integer frameRate = iterator2.next().getFrameRate();
            if (frameRate != null) {
                list3.add(frameRate);
            }
        }
        final Integer n3 = (Integer)CollectionsKt___CollectionsKt.P3((ArrayList)list3);
        if (n3 != null) {
            intValue = n3;
        }
        final ArrayList<Size> list4 = new ArrayList<Size>();
        final Iterator<Object> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            final Size size2 = iterator3.next().getSize();
            if (size2 != null) {
                list4.add(size2);
            }
        }
        final Iterator<Size> iterator4 = list4.iterator();
        Size next;
        if (!iterator4.hasNext()) {
            next = null;
        }
        else {
            next = iterator4.next();
            if (iterator4.hasNext()) {
                final Size size3 = next;
                int n4 = size3.getWidth() + size3.getHeight();
                Size size4 = next;
                do {
                    final Size next2 = iterator4.next();
                    final Size size5 = next2;
                    final int n5 = size5.getWidth() + size5.getHeight();
                    next = size4;
                    int n6;
                    if ((n6 = n4) > n5) {
                        next = next2;
                        n6 = n5;
                    }
                    size4 = next;
                    n4 = n6;
                } while (iterator4.hasNext());
            }
        }
        Size size6 = next;
        if (size6 == null) {
            size6 = size;
        }
        return new CompressionConfig(intValue2, intValue, n, size6);
    }
}
