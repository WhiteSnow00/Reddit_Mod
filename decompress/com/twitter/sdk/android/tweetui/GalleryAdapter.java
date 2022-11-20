// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.squareup.picasso.p;
import android.graphics.Bitmap;
import com.squareup.picasso.l;
import com.squareup.picasso.l$a;
import com.squareup.picasso.m;
import com.squareup.picasso.q;
import com.squareup.picasso.Picasso$LoadedFrom;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.s;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.tweetui.internal.GalleryImageView;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.sdk.android.core.models.MediaEntity;
import java.util.List;
import android.content.Context;
import com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener;
import androidx.viewpager.widget.a;

class GalleryAdapter extends a
{
    public final SwipeToDismissTouchListener.Callback callback;
    public final Context context;
    public final List<MediaEntity> items;
    
    public GalleryAdapter(final Context context, final SwipeToDismissTouchListener.Callback callback) {
        this.items = new ArrayList<MediaEntity>();
        this.context = context;
        this.callback = callback;
    }
    
    public void addAll(final List<MediaEntity> list) {
        this.items.addAll(list);
        this.notifyDataSetChanged();
    }
    
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        viewGroup.removeView((View)o);
    }
    
    public int getCount() {
        return this.items.size();
    }
    
    public Object instantiateItem(final ViewGroup viewGroup, int n) {
        final GalleryImageView galleryImageView = new GalleryImageView(this.context);
        galleryImageView.setSwipeToDismissCallback(this.callback);
        viewGroup.addView((View)galleryImageView);
        final m d = Picasso.f(this.context).d(this.items.get(n).mediaUrlHttps);
        final long nanoTime = System.nanoTime();
        s.b();
        if (!d.c) {
            final l$a b = d.b;
            if (b.a == null && b.b == 0) {
                n = 0;
            }
            else {
                n = 1;
            }
            if (n == 0) {
                d.a.a((Object)galleryImageView);
                ((p)galleryImageView).onPrepareLoad(d.e);
            }
            else {
                final l a = d.a(nanoTime);
                final String c = s.c(a);
                if (MemoryPolicy.shouldReadFromMemoryCache(0)) {
                    final Bitmap e = d.a.e(c);
                    if (e != null) {
                        d.a.a((Object)galleryImageView);
                        ((p)galleryImageView).onBitmapLoaded(e, Picasso$LoadedFrom.MEMORY);
                        return galleryImageView;
                    }
                }
                ((p)galleryImageView).onPrepareLoad(d.e);
                d.a.c((com.squareup.picasso.a)new q(d.a, galleryImageView, a, c, d.d));
            }
            return galleryImageView;
        }
        throw new IllegalStateException("Fit cannot be used with a Target.");
    }
    
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
}
