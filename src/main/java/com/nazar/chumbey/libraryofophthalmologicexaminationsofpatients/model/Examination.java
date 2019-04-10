package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;


import lombok.Data;

import javax.persistence.Entity;
import java.sql.Blob;
import java.sql.Date;

@Data
@Entity
public class Examination {

    private int id;

    private int patient_id;

    private int workers_id;

    private Date dateOfSurvey;

    private String fosfenOD;

    private String fosfenOS;

    private String botOD;

    private String botOS;

    private Blob vizusOD;

    private Blob vizusOS;

    private Blob humphreyOD;

    private Blob humphreyOS;

    private Blob hicknessOfCorneaOD_1;

    private Blob hicknessOfCorneaOD_2;

    private Blob hicknessOfCorneaOD_3;

    private Blob hicknessOfCorneaOD_4;

    private Blob hicknessOfCorneaOS_1;

    private Blob hicknessOfCorneaOS_2;

    private Blob hicknessOfCorneaOS_3;

    private Blob hicknessOfCorneaOS_4;

    private Blob atlasOD;

    private Blob atlasOS;

    private Blob cameraOD;

    private Blob cameraOS;

    private Blob cameraOD3D;

    private Blob cameraOS3D;

    private Blob corneeN_OD;

    private Blob corneeN_OS;

    private Blob gdxOD;

    private Blob gdxOS;

    private Blob hrtOD;

    private Blob hrtOS;

    private Blob maculaOD_1;

    private Blob maculaOD_2;

    private Blob maculaOD_3;

    private Blob maculaOD_4;

    private Blob maculaOS_1;

    private Blob maculaOS_2;

    private Blob maculaOS_3;

    private Blob maculaOS_4;

    private Blob maculaOD3D_1;

    private Blob maculaOD3D_2;

    private Blob maculaOD3D_3;

    private Blob maculaOD3D_4;

    private Blob maculaOS3D_1;

    private Blob maculaOS3D_2;

    private Blob maculaOS3D_3;

    private Blob maculaOS3D_4;

    private Blob sightOD;

    private Blob sightOS;

    private Blob atlasOU;

    private Blob maculaOU;

    private Blob hrtOU;

    private Blob fieldView_OU;

    private String formatFile_vizusOD;

    private String formatFile_vizusOS;

    private String formatFile_humphreyOD;

    private String formatFile_humphreyOS;

    private String formatFile_hicknessOfCorneaOD_1;

    private String formatFile_hicknessOfCorneaOD_2;

    private String formatFile_hicknessOfCorneaOD_3;

    private String formatFile_hicknessOfCorneaOD_4;

    private String formatFile_hicknessOfCorneaOS_1;

    private String formatFile_hicknessOfCorneaOS_2;

    private String formatFile_hicknessOfCorneaOS_3;

    private String formatFile_hicknessOfCorneaOS_4;

    private String formatFile_atlasOD;

    private String formatFile_atlasOS;

    private String formatFile_cameraOD;

    private String formatFile_cameraOS;

    private String formatFile_cameraOD3D;

    private String formatFile_cameraOS3D;

    private String formatFile_corneeN_OD;

    private String formatFile_corneeN_OS;

    private String formatFile_gdxOD;

    private String formatFile_gdxOS;

    private String formatFile_hrtOD;

    private String formatFile_hrtOS;

    private String formatFile_maculaOD_1;

    private String formatFile_maculaOD_2;

    private String formatFile_maculaOD_3;

    private String formatFile_maculaOD_4;

    private String formatFile_maculaOS_1;

    private String formatFile_maculaOS_2;

    private String formatFile_maculaOS_3;

    private String formatFile_maculaOS_4;

    private String formatFile_maculaOD3D_1;

    private String formatFile_maculaOD3D_2;

    private String formatFile_maculaOD3D_3;

    private String formatFile_maculaOD3D_4;

    private String formatFile_maculaOS3D_1;

    private String formatFile_maculaOS3D_2;

    private String formatFile_maculaOS3D_3;

    private String formatFile_maculaOS3D_4;

    private String formatFile_sightOD;

    private String formatFile_sightOS;

    private String formatFile_atlasOU;

    private String formatFile_maculaOU;

    private String formatFile_hrtOU;

    private String formatFile_fieldView_OU;

}
