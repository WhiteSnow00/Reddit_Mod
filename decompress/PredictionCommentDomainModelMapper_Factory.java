// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.predictions;

import se2.d;

public final class PredictionCommentDomainModelMapper_Factory implements d<PredictionCommentDomainModelMapper>
{
    public static PredictionCommentDomainModelMapper_Factory create() {
        return PredictionCommentDomainModelMapper_Factory.PredictionCommentDomainModelMapper_Factory$InstanceHolder.access$000();
    }
    
    public static PredictionCommentDomainModelMapper newInstance() {
        return new PredictionCommentDomainModelMapper();
    }
    
    public PredictionCommentDomainModelMapper get() {
        return newInstance();
    }
}
