package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPipeline is a Querydsl query type for Pipeline
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPipeline extends EntityPathBase<Pipeline> {

    private static final long serialVersionUID = 1260488836L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPipeline pipeline = new QPipeline("pipeline");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final MapPath<String, EnvironmentStage, QEnvironmentStage> environmentStageMap = this.<String, EnvironmentStage, QEnvironmentStage>createMap("environmentStageMap", String.class, EnvironmentStage.class, QEnvironmentStage.class);

    public final SetPath<Build, QBuild> failedBuilds = this.<Build, QBuild>createSet("failedBuilds", Build.class, QBuild.class, PathInits.DIRECT2);

    // inherited
    public final org.bson.types.QObjectId id;

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QPipeline(String variable) {
        this(Pipeline.class, forVariable(variable), INITS);
    }

    public QPipeline(Path<? extends Pipeline> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPipeline(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPipeline(PathMetadata metadata, PathInits inits) {
        this(Pipeline.class, metadata, inits);
    }

    public QPipeline(Class<? extends Pipeline> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

