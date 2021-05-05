package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnvironmentComponent is a Querydsl query type for EnvironmentComponent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnvironmentComponent extends EntityPathBase<EnvironmentComponent> {

    private static final long serialVersionUID = -664614132L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnvironmentComponent environmentComponent = new QEnvironmentComponent("environmentComponent");

    public final QBaseModel _super;

    public final StringPath applicationName = createString("applicationName");

    public final NumberPath<Long> asOfDate = createNumber("asOfDate", Long.class);

    public final org.bson.types.QObjectId buildId;

    public final StringPath changeReference = createString("changeReference");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath componentID = createString("componentID");

    public final StringPath componentName = createString("componentName");

    public final StringPath componentPath = createString("componentPath");

    public final StringPath componentVersion = createString("componentVersion");

    public final BooleanPath deployed = createBoolean("deployed");

    public final NumberPath<Long> deployTime = createNumber("deployTime", Long.class);

    public final StringPath environmentID = createString("environmentID");

    public final StringPath environmentName = createString("environmentName");

    public final StringPath environmentUrl = createString("environmentUrl");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath jobStageName = createString("jobStageName");

    public final StringPath jobStageStatus = createString("jobStageStatus");

    public final StringPath jobUrl = createString("jobUrl");

    public final StringPath serviceName = createString("serviceName");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QEnvironmentComponent(String variable) {
        this(EnvironmentComponent.class, forVariable(variable), INITS);
    }

    public QEnvironmentComponent(Path<? extends EnvironmentComponent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnvironmentComponent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnvironmentComponent(PathMetadata metadata, PathInits inits) {
        this(EnvironmentComponent.class, metadata, inits);
    }

    public QEnvironmentComponent(Class<? extends EnvironmentComponent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.buildId = inits.isInitialized("buildId") ? new org.bson.types.QObjectId(forProperty("buildId")) : null;
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

