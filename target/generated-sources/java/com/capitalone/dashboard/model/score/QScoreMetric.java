package com.capitalone.dashboard.model.score;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScoreMetric is a Querydsl query type for ScoreMetric
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScoreMetric extends EntityPathBase<ScoreMetric> {

    private static final long serialVersionUID = -1947853340L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScoreMetric scoreMetric = new QScoreMetric("scoreMetric");

    public final com.capitalone.dashboard.model.QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final CollectionPath<ScoreComponentMetric, QScoreComponentMetric> componentMetrics = this.<ScoreComponentMetric, QScoreComponentMetric>createCollection("componentMetrics", ScoreComponentMetric.class, QScoreComponentMetric.class, PathInits.DIRECT2);

    public final StringPath failureMssg = createString("failureMssg");

    // inherited
    public final org.bson.types.QObjectId id;

    public final BooleanPath noScore = createBoolean("noScore");

    public final MapPath<String, String, StringPath> options = this.<String, String, StringPath>createMap("options", String.class, String.class, StringPath.class);

    public final StringPath score = createString("score");

    public final org.bson.types.QObjectId scoreTypeId;

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final StringPath total = createString("total");

    public final EnumPath<ScoreValueType> type = createEnum("type", ScoreValueType.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QScoreMetric(String variable) {
        this(ScoreMetric.class, forVariable(variable), INITS);
    }

    public QScoreMetric(Path<? extends ScoreMetric> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScoreMetric(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScoreMetric(PathMetadata metadata, PathInits inits) {
        this(ScoreMetric.class, metadata, inits);
    }

    public QScoreMetric(Class<? extends ScoreMetric> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.capitalone.dashboard.model.QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.scoreTypeId = inits.isInitialized("scoreTypeId") ? new org.bson.types.QObjectId(forProperty("scoreTypeId")) : null;
        this.upsertTime = _super.upsertTime;
    }

}

