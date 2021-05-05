package com.capitalone.dashboard.model.score.settings;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBuildScoreSettings is a Querydsl query type for BuildScoreSettings
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QBuildScoreSettings extends BeanPath<BuildScoreSettings> {

    private static final long serialVersionUID = -1063690252L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBuildScoreSettings buildScoreSettings = new QBuildScoreSettings("buildScoreSettings");

    public final QScoreComponentSettings _super = new QScoreComponentSettings(this);

    //inherited
    public final SimplePath<ScoreCriteria> criteria = _super.criteria;

    //inherited
    public final BooleanPath disabled = _super.disabled;

    public final SimplePath<BuildScoreSettings.BuildDurationScoreSettings> duration = createSimple("duration", BuildScoreSettings.BuildDurationScoreSettings.class);

    public final NumberPath<Integer> numberOfDays = createNumber("numberOfDays", Integer.class);

    public final QScoreComponentSettings status;

    //inherited
    public final NumberPath<Integer> weight = _super.weight;

    public QBuildScoreSettings(String variable) {
        this(BuildScoreSettings.class, forVariable(variable), INITS);
    }

    public QBuildScoreSettings(Path<? extends BuildScoreSettings> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBuildScoreSettings(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBuildScoreSettings(PathMetadata metadata, PathInits inits) {
        this(BuildScoreSettings.class, metadata, inits);
    }

    public QBuildScoreSettings(Class<? extends BuildScoreSettings> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.status = inits.isInitialized("status") ? new QScoreComponentSettings(forProperty("status")) : null;
    }

}

