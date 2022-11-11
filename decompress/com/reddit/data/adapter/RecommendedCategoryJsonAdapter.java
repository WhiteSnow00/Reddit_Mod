// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import java.util.Collection;
import com.reddit.data.model.ListingEnvelope;
import ig2.m;
import com.squareup.moshi.x;
import java.util.Iterator;
import com.reddit.data.model.ChildrenEnvelope;
import java.util.List;
import com.reddit.domain.model.listing.Listing;
import com.reddit.data.model.Envelope;
import com.reddit.domain.model.Subreddit;
import java.util.ArrayList;
import sg2.e;
import com.reddit.data.model.category.RecommendedCategory;
import com.squareup.moshi.JsonReader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.data.model.category.RecommendedCategoryEnvelope;
import com.squareup.moshi.JsonAdapter$e;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Lcom/reddit/data/adapter/RecommendedCategoryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/reddit/data/model/category/RecommendedCategory;", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value", "Lhg2/j;", "toJson", "Lcom/reddit/data/model/category/RecommendedCategoryEnvelope;", "delegate", "Lcom/squareup/moshi/JsonAdapter;", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "Companion", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecommendedCategoryJsonAdapter extends JsonAdapter<Object>
{
    public static final RecommendedCategoryJsonAdapter.RecommendedCategoryJsonAdapter$Companion Companion;
    private static final JsonAdapter$e FACTORY;
    private final JsonAdapter<RecommendedCategoryEnvelope> delegate;
    
    static {
        Companion = new RecommendedCategoryJsonAdapter.RecommendedCategoryJsonAdapter$Companion((DefaultConstructorMarker)null);
        FACTORY = (JsonAdapter$e)new RecommendedCategoryJsonAdapter$Companion$FACTORY.RecommendedCategoryJsonAdapter$Companion$FACTORY$1();
    }
    
    private RecommendedCategoryJsonAdapter(final JsonAdapter<RecommendedCategoryEnvelope> delegate) {
        this.delegate = delegate;
    }
    
    public RecommendedCategory fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        final RecommendedCategoryEnvelope recommendedCategoryEnvelope = (RecommendedCategoryEnvelope)this.delegate.fromJson(jsonReader);
        RecommendedCategory recommendedCategory;
        if (recommendedCategoryEnvelope != null) {
            final String icon = recommendedCategoryEnvelope.getIcon();
            final String color = recommendedCategoryEnvelope.getColor();
            final ChildrenEnvelope data = recommendedCategoryEnvelope.getSubreddits().getData();
            final List children = data.getChildren();
            final ArrayList list = new ArrayList();
            final Iterator iterator = children.iterator();
            while (iterator.hasNext()) {
                final Subreddit subreddit = (Subreddit)((Envelope)iterator.next()).getData();
                if (subreddit != null) {
                    list.add(subreddit);
                }
            }
            recommendedCategory = new RecommendedCategory(icon, color, new Listing((List)list, data.getAfter(), data.getBefore(), (String)null, (String)null, false, (List)null, 120, (DefaultConstructorMarker)null));
        }
        else {
            recommendedCategory = null;
        }
        return recommendedCategory;
    }
    
    public void toJson(final x x, Object o) {
        e.f((Object)x, "writer");
        RecommendedCategory recommendedCategory;
        if (o instanceof RecommendedCategory) {
            recommendedCategory = (RecommendedCategory)o;
        }
        else {
            recommendedCategory = null;
        }
        if (recommendedCategory != null) {
            final List children = recommendedCategory.getSubreddits().getChildren();
            o = new ArrayList(m.c3((Iterable)children, 10));
            final Iterator iterator = children.iterator();
            while (iterator.hasNext()) {
                ((Collection<Envelope>)o).add(new Envelope((Object)iterator.next(), (String)null, 2, (DefaultConstructorMarker)null));
            }
            this.delegate.toJson((Object)new RecommendedCategoryEnvelope(recommendedCategory.getIcon(), recommendedCategory.getColor(), new ListingEnvelope(new ChildrenEnvelope((List)o, (String)null, (String)null, (Integer)null))));
        }
    }
}
