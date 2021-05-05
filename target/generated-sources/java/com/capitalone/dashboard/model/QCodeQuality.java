package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCodeQuality is a Querydsl query type for CodeQuality
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCodeQuality extends EntityPathBase<CodeQuality> {

    private static final long serialVersionUID = -910994128L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCodeQuality codeQuality = new QCodeQuality("codeQuality");

    public final QBaseModel _super;

    public final org.bson.types.QObjectId buildId;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final SetPath<CodeQualityMetric, QCodeQualityMetric> metrics = this.<CodeQualityMetric, QCodeQualityMetric>createSet("metrics", CodeQualityMetric.class, QCodeQualityMetric.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath reportUrl = createString("reportUrl");

    public final StringPath scanType = createString("scanType");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final EnumPath<CodeQualityType> type = createEnum("type", CodeQualityType.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath url = createString("url");

    public final StringPath version = createString("version");

    public QCodeQuality(String variable) {
        this(CodeQuality.class, forVariable(variable), INITS);
    }

    public QCodeQuality(Path<? extends CodeQuality> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCodeQuality(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCodeQuality(PathMetadata metadata, PathInits inits) {
        this(CodeQuality.class, metadata, inits);
    }

    public QCodeQuality(Class<? extends CodeQuality> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.buildId = inits.isInitialized("buildId") ? new org.bson.types.QObjectId(forProperty("buildId")) : null;
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

