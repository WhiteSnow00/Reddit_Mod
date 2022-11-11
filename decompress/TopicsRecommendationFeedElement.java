// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.reddit.domain.model.topic.InterestTopic;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\r¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/TopicsRecommendationFeedElement;", "Lcom/reddit/domain/model/ILink;", "id", "", "topics", "", "Lcom/reddit/domain/model/topic/InterestTopic;", "(Ljava/lang/String;Ljava/util/List;)V", "createdUtc", "", "getCreatedUtc", "()J", "getId", "()Ljava/lang/String;", "isBlankAd", "", "()Z", "kindWithId", "getKindWithId", "promoted", "getPromoted", "getTopics", "()Ljava/util/List;", "uniqueId", "getUniqueId", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class TopicsRecommendationFeedElement extends ILink
{
    private final long createdUtc;
    private final String id;
    private final boolean isBlankAd;
    private final String kindWithId;
    private final boolean promoted;
    private final List<InterestTopic> topics;
    private final String uniqueId;
    
    public TopicsRecommendationFeedElement(final String id, final List<InterestTopic> topics) {
        e.f((Object)id, "id");
        e.f((Object)topics, "topics");
        super((DefaultConstructorMarker)null);
        this.id = id;
        this.topics = topics;
        final StringBuilder r = a.r("topics_discovery_unit_");
        r.append(this.getId());
        this.kindWithId = r.toString();
        this.uniqueId = this.getId();
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final List<InterestTopic> component2() {
        return this.topics;
    }
    
    public final TopicsRecommendationFeedElement copy(final String s, final List<InterestTopic> list) {
        e.f((Object)s, "id");
        e.f((Object)list, "topics");
        return new TopicsRecommendationFeedElement(s, list);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopicsRecommendationFeedElement)) {
            return false;
        }
        final TopicsRecommendationFeedElement topicsRecommendationFeedElement = (TopicsRecommendationFeedElement)o;
        return e.a((Object)this.getId(), (Object)topicsRecommendationFeedElement.getId()) && e.a((Object)this.topics, (Object)topicsRecommendationFeedElement.topics);
    }
    
    public long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public boolean getPromoted() {
        return this.promoted;
    }
    
    public final List<InterestTopic> getTopics() {
        return this.topics;
    }
    
    public String getUniqueId() {
        return this.uniqueId;
    }
    
    public int hashCode() {
        return this.topics.hashCode() + this.getId().hashCode() * 31;
    }
    
    public boolean isBlankAd() {
        return this.isBlankAd;
    }
    
    public String toString() {
        final StringBuilder r = a.r("TopicsRecommendationFeedElement(id=");
        r.append(this.getId());
        r.append(", topics=");
        return d.o(r, (List)this.topics, ')');
    }
}
