// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.widgets;

import android.view.View;
import java.util.Iterator;
import yg2.i;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import ig2.w;
import java.util.ArrayList;
import ig2.m;
import lg.e0;
import android.content.Context;
import kotlin.Metadata;
import java.util.List;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "", "Lsf0/a;", "invoke", "()Ljava/util/List;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class BubblingAnimationView$itemViews$2 extends Lambda implements a<List<? extends sf0.a>>
{
    public final /* synthetic */ Context $context;
    public final /* synthetic */ BubblingAnimationView this$0;
    
    public BubblingAnimationView$itemViews$2(final BubblingAnimationView this$0, final Context $context) {
        this.this$0 = this$0;
        this.$context = $context;
        super(0);
    }
    
    public final List<sf0.a> invoke() {
        final i v0 = e0.v0(0, this.this$0.j);
        final Context $context = this.$context;
        final BubblingAnimationView this$0 = this.this$0;
        final ArrayList list = new ArrayList(m.c3((Iterable)v0, 10));
        final Iterator iterator = ((Iterable)v0).iterator();
        while (iterator.hasNext()) {
            ((w)iterator).nextInt();
            final View inflate = LayoutInflater.from($context).inflate(2131624086, (ViewGroup)this$0, false);
            ((ViewGroup)this$0).addView(inflate);
            if (inflate == null) {
                throw new NullPointerException("rootView");
            }
            final ImageView imageView = (ImageView)inflate;
            final sf0.a a = new sf0.a(imageView, imageView);
            ((View)imageView).setVisibility(8);
            imageView.setImageResource(this$0.k);
            list.add((Object)a);
        }
        return (List<sf0.a>)list;
    }
}
