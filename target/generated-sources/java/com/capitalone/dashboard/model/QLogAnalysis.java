package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLogAnalysis is a Querydsl query type for LogAnalysis
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLogAnalysis extends EntityPathBase<LogAnalysis> {

    private static final long serialVersionUID = 58029342L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLogAnalysis logAnalysis = new QLogAnalysis("logAnalysis");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final ListPath<LogAnalysisMetric, QLogAnalysisMetric> metrics = this.<LogAnalysisMetric, QLogAnalysisMetric>createList("metrics", LogAnalysisMetric.class, QLogAnalysisMetric.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QLogAnalysis(String variable) {
        this(LogAnalysis.class, forVariable(variable), INITS);
    }

    public QLogAnalysis(Path<? extends LogAnalysis> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLogAnalysis(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLogAnalysis(PathMetadata metadata, PathInits inits) {
        this(LogAnalysis.class, metadata, inits);
    }

    public QLogAnalysis(Class<? extends LogAnalysis> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

