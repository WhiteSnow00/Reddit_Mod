// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import com.reddit.domain.model.Gender;
import com.reddit.queries.b3$c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/reddit/data/model/GqlGenderDomainMapper;", "", "Lcom/reddit/queries/b3$c;", "gender", "Lcom/reddit/domain/model/Gender;", "toGenderDomainModel", "<init>", "()V", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class GqlGenderDomainMapper
{
    public static final GqlGenderDomainMapper INSTANCE;
    
    static {
        INSTANCE = new GqlGenderDomainMapper();
    }
    
    private GqlGenderDomainMapper() {
    }
    
    public final Gender toGenderDomainModel(final b3$c b3$c) {
        f.f((Object)b3$c, "gender");
        return new Gender(b3$c.b, AccountGenderCategoryMapper.INSTANCE.map(b3$c.c));
    }
}
