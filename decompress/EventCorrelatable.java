// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.telemetry;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X�\u0004�\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005�\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/telemetry/EventCorrelatable;", "", "eventCorrelationId", "", "getEventCorrelationId", "()Ljava/lang/String;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface EventCorrelatable
{
    String getEventCorrelationId();
}