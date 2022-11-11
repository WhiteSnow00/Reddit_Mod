// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class MLModel
{
    public static final a<MLModel, Builder> ADAPTER;
    public final String client_name;
    public final String features;
    public final String name;
    public final String owner;
    public final String prediction;
    public final String prediction_id;
    public final String prediction_scores;
    public final String prediction_source;
    public final String type;
    public final String version;
    
    static {
        ADAPTER = (a)new MLModelAdapter(null);
    }
    
    private MLModel(final Builder builder) {
        this.name = Builder.access$100(builder);
        this.version = Builder.access$200(builder);
        this.owner = Builder.access$300(builder);
        this.prediction = Builder.access$400(builder);
        this.features = Builder.access$500(builder);
        this.prediction_id = Builder.access$600(builder);
        this.client_name = Builder.access$700(builder);
        this.prediction_scores = Builder.access$800(builder);
        this.type = Builder.access$900(builder);
        this.prediction_source = Builder.access$1000(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof MLModel)) {
            return false;
        }
        final MLModel mlModel = (MLModel)o;
        final String name = this.name;
        final String name2 = mlModel.name;
        if (name == name2 || (name != null && name.equals(name2))) {
            final String version = this.version;
            final String version2 = mlModel.version;
            if (version == version2 || (version != null && version.equals(version2))) {
                final String owner = this.owner;
                final String owner2 = mlModel.owner;
                if (owner == owner2 || (owner != null && owner.equals(owner2))) {
                    final String prediction = this.prediction;
                    final String prediction2 = mlModel.prediction;
                    if (prediction == prediction2 || (prediction != null && prediction.equals(prediction2))) {
                        final String features = this.features;
                        final String features2 = mlModel.features;
                        if (features == features2 || (features != null && features.equals(features2))) {
                            final String prediction_id = this.prediction_id;
                            final String prediction_id2 = mlModel.prediction_id;
                            if (prediction_id == prediction_id2 || (prediction_id != null && prediction_id.equals(prediction_id2))) {
                                final String client_name = this.client_name;
                                final String client_name2 = mlModel.client_name;
                                if (client_name == client_name2 || (client_name != null && client_name.equals(client_name2))) {
                                    final String prediction_scores = this.prediction_scores;
                                    final String prediction_scores2 = mlModel.prediction_scores;
                                    if (prediction_scores == prediction_scores2 || (prediction_scores != null && prediction_scores.equals(prediction_scores2))) {
                                        final String type = this.type;
                                        final String type2 = mlModel.type;
                                        if (type == type2 || (type != null && type.equals(type2))) {
                                            final String prediction_source = this.prediction_source;
                                            final String prediction_source2 = mlModel.prediction_source;
                                            boolean b2 = b;
                                            if (prediction_source == prediction_source2) {
                                                return b2;
                                            }
                                            if (prediction_source != null && prediction_source.equals(prediction_source2)) {
                                                b2 = b;
                                                return b2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String name = this.name;
        int hashCode = 0;
        int hashCode2;
        if (name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = name.hashCode();
        }
        final String version = this.version;
        int hashCode3;
        if (version == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = version.hashCode();
        }
        final String owner = this.owner;
        int hashCode4;
        if (owner == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = owner.hashCode();
        }
        final String prediction = this.prediction;
        int hashCode5;
        if (prediction == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = prediction.hashCode();
        }
        final String features = this.features;
        int hashCode6;
        if (features == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = features.hashCode();
        }
        final String prediction_id = this.prediction_id;
        int hashCode7;
        if (prediction_id == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = prediction_id.hashCode();
        }
        final String client_name = this.client_name;
        int hashCode8;
        if (client_name == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = client_name.hashCode();
        }
        final String prediction_scores = this.prediction_scores;
        int hashCode9;
        if (prediction_scores == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = prediction_scores.hashCode();
        }
        final String type = this.type;
        int hashCode10;
        if (type == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = type.hashCode();
        }
        final String prediction_source = this.prediction_source;
        if (prediction_source != null) {
            hashCode = prediction_source.hashCode();
        }
        return ((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MLModel{name=");
        k.append(this.name);
        k.append(", version=");
        k.append(this.version);
        k.append(", owner=");
        k.append(this.owner);
        k.append(", prediction=");
        k.append(this.prediction);
        k.append(", features=");
        k.append(this.features);
        k.append(", prediction_id=");
        k.append(this.prediction_id);
        k.append(", client_name=");
        k.append(this.client_name);
        k.append(", prediction_scores=");
        k.append(this.prediction_scores);
        k.append(", type=");
        k.append(this.type);
        k.append(", prediction_source=");
        return b.j(k, this.prediction_source, "}");
    }
    
    public void write(final e e) throws IOException {
        MLModel.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<MLModel>
    {
        private String client_name;
        private String features;
        private String name;
        private String owner;
        private String prediction;
        private String prediction_id;
        private String prediction_scores;
        private String prediction_source;
        private String type;
        private String version;
        
        public Builder() {
        }
        
        public Builder(final MLModel mlModel) {
            this.name = mlModel.name;
            this.version = mlModel.version;
            this.owner = mlModel.owner;
            this.prediction = mlModel.prediction;
            this.features = mlModel.features;
            this.prediction_id = mlModel.prediction_id;
            this.client_name = mlModel.client_name;
            this.prediction_scores = mlModel.prediction_scores;
            this.type = mlModel.type;
            this.prediction_source = mlModel.prediction_source;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.prediction_source;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.version;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.owner;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.prediction;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.features;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.prediction_id;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.client_name;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.prediction_scores;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.type;
        }
        
        public MLModel build() {
            return new MLModel(this, null);
        }
        
        public Builder client_name(final String client_name) {
            this.client_name = client_name;
            return this;
        }
        
        public Builder features(final String features) {
            this.features = features;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder owner(final String owner) {
            this.owner = owner;
            return this;
        }
        
        public Builder prediction(final String prediction) {
            this.prediction = prediction;
            return this;
        }
        
        public Builder prediction_id(final String prediction_id) {
            this.prediction_id = prediction_id;
            return this;
        }
        
        public Builder prediction_scores(final String prediction_scores) {
            this.prediction_scores = prediction_scores;
            return this;
        }
        
        public Builder prediction_source(final String prediction_source) {
            this.prediction_source = prediction_source;
            return this;
        }
        
        public void reset() {
            this.name = null;
            this.version = null;
            this.owner = null;
            this.prediction = null;
            this.features = null;
            this.prediction_id = null;
            this.client_name = null;
            this.prediction_scores = null;
            this.type = null;
            this.prediction_source = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder version(final String version) {
            this.version = version;
            return this;
        }
    }
    
    public static final class MLModelAdapter implements a<MLModel, Builder>
    {
        private MLModelAdapter() {
        }
        
        public MLModel read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public MLModel read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.prediction_source(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.prediction_scores(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.client_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.prediction_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.features(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.prediction(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.owner(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.version(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final MLModel mlModel) throws IOException {
            e.a0();
            if (mlModel.name != null) {
                e.N(1, (byte)11);
                e.Z(mlModel.name);
                e.O();
            }
            if (mlModel.version != null) {
                e.N(2, (byte)11);
                e.Z(mlModel.version);
                e.O();
            }
            if (mlModel.owner != null) {
                e.N(3, (byte)11);
                e.Z(mlModel.owner);
                e.O();
            }
            if (mlModel.prediction != null) {
                e.N(4, (byte)11);
                e.Z(mlModel.prediction);
                e.O();
            }
            if (mlModel.features != null) {
                e.N(5, (byte)11);
                e.Z(mlModel.features);
                e.O();
            }
            if (mlModel.prediction_id != null) {
                e.N(6, (byte)11);
                e.Z(mlModel.prediction_id);
                e.O();
            }
            if (mlModel.client_name != null) {
                e.N(7, (byte)11);
                e.Z(mlModel.client_name);
                e.O();
            }
            if (mlModel.prediction_scores != null) {
                e.N(8, (byte)11);
                e.Z(mlModel.prediction_scores);
                e.O();
            }
            if (mlModel.type != null) {
                e.N(9, (byte)11);
                e.Z(mlModel.type);
                e.O();
            }
            if (mlModel.prediction_source != null) {
                e.N(10, (byte)11);
                e.Z(mlModel.prediction_source);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
