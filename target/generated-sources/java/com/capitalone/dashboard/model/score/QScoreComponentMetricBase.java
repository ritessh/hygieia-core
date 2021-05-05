package com.capitalone.dashboard.model.score;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScoreComponentMetricBase is a Querydsl query type for ScoreComponentMetricBase
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QScoreComponentMetricBase extends BeanPath<ScoreComponentMetricBase> {

    private static final long serialVersionUID = 1915979210L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScoreComponentMetricBase scoreComponentMetricBase = new QScoreComponentMetricBase("scoreComponentMetricBase");

    public final BooleanPath alert = createBoolean("alert");

    public final StringPath displayId = createString("displayId");

    public final StringPath displayName = createString("displayName");

    public final StringPath message = createString("message");

    public final BooleanPath noScore = createBoolean("noScore");

    public final MapPath<String, Object, SimplePath<Object>> options = this.<String, Object, SimplePath<Object>>createMap("options", String.class, Object.class, SimplePath.class);

    public final StringPath propagate = createString("propagate");

    public final org.bson.types.QObjectId refId;

    public final StringPath score = createString("score");

    public final StringPath state = createString("state");

    public final StringPath total = createString("total");

    public final StringPath weight = createString("weight");

    public QScoreComponentMetricBase(String variable) {
        this(ScoreComponentMetricBase.class, forVariable(variable), INITS);
    }

    public QScoreComponentMetricBase(Path<? extends ScoreComponentMetricBase> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScoreComponentMetricBase(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScoreComponentMetricBase(PathMetadata metadata, PathInits inits) {
        this(ScoreComponentMetricBase.class, metadata, inits);
    }

    public QScoreComponentMetricBase(Class<? extends ScoreComponentMetricBase> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.refId = inits.isInitialized("refId") ? new org.bson.types.QObjectId(forProperty("refId")) : null;
    }

}

