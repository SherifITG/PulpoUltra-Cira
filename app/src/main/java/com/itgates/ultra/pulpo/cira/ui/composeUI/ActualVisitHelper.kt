package com.itgates.ultra.pulpo.cira.ui.composeUI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import com.itgates.ultra.pulpo.cira.roomDataBase.roomUtils.IdAndNameObj
import com.itgates.ultra.pulpo.cira.ui.activities.ActualActivity
import com.itgates.ultra.pulpo.cira.ui.theme.padding_2
import com.itgates.ultra.pulpo.cira.ui.theme.padding_4
import com.itgates.ultra.pulpo.cira.ui.utils.ActualCurrentValues

@Composable
fun DoctorWithoutNumAndMultiplicity(
    activity: ActualActivity,
    isDataChangedToRefresh: MutableState<Boolean>,
    doctorCurrentValue: MutableState<IdAndNameObj>,
    multiplicityCurrentValue: MutableState<IdAndNameObj>,
) {
    Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(padding_4)) {
        if (activity.currentValues.isDoctorVisible()) {
            Box(modifier = Modifier.weight(1F)) {
                SelectableDropDownMenu(
                    activity,
                    activity.currentValues.doctorsList,
                    doctorCurrentValue,
                    isDataChangedToRefresh,
                    activity.currentValues.doctorErrorValue
                )
            }
        }
        else {
            Box(modifier = Modifier.weight(1F)) {
                DisabledDropDownMenu(ActualCurrentValues.doctorStartValue.embedded.name)
            }
        }
        Box(modifier = Modifier.weight(1F)) {
            SelectableDropDownMenu(
                activity,
                activity.currentValues.multiplicityList,
                multiplicityCurrentValue,
                isDataChangedToRefresh,
                activity.currentValues.multiplicityErrorValue
            )
        }
    }
}

@Composable
fun DoctorWithNumAndMultiplicity(
    activity: ActualActivity,
    isDataChangedToRefresh: MutableState<Boolean>,
    doctorCurrentValue: MutableState<IdAndNameObj>,
    noOfDoctorCurrentValue: MutableState<IdAndNameObj>,
    multiplicityCurrentValue: MutableState<IdAndNameObj>,
) {
    Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(padding_4)) {
        if (activity.currentValues.isDoctorVisible()) {
            Box(modifier = Modifier.weight(1F)) {
                SelectableDropDownMenu(
                    activity,
                    activity.currentValues.doctorsList,
                    doctorCurrentValue,
                    isDataChangedToRefresh,
                    activity.currentValues.doctorErrorValue
                )
            }
        }
        else {
            Box(modifier = Modifier.weight(1F)) {
                DisabledDropDownMenu(ActualCurrentValues.doctorStartValue.embedded.name)
            }
        }
        if (activity.currentValues.isNoOfDoctorVisible()) {
            Box(modifier = Modifier.weight(1F)) {
                SelectableDropDownMenu(
                    activity,
                    ActualCurrentValues.noOfDoctorList,
                    noOfDoctorCurrentValue,
                    isDataChangedToRefresh,
                    false
                )
            }
        }
        else {
            Box(modifier = Modifier.weight(1F)) {
                DisabledDropDownMenu(activity.currentValues.noOfDoctorCurrentValue.embedded.name)
            }
        }
    }
    Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(padding_2)) { // custom scenario (padding_2)
        Spacer(modifier = Modifier.weight(1F))
        Box(modifier = Modifier.weight(2F)) {
            SelectableDropDownMenu(
                activity,
                activity.currentValues.multiplicityList,
                multiplicityCurrentValue,
                isDataChangedToRefresh,
                activity.currentValues.multiplicityErrorValue
            )
        }
        Spacer(modifier = Modifier.weight(1F))
    }
}

@Composable
fun PlannedDoctorWithoutNumAndMultiplicity(
    activity: ActualActivity,
    isDataChangedToRefresh: MutableState<Boolean>,
    multiplicityCurrentValue: MutableState<IdAndNameObj>,
) {
    Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(padding_4)) {
        Box(modifier = Modifier.weight(1F)) {
            PlannedSelectedDropDownMenu(
                activity.currentValues.doctorCurrentValue.embedded.name
            )
        }
        Box(modifier = Modifier.weight(1F)) {
            SelectableDropDownMenu(
                activity,
                activity.currentValues.multiplicityList,
                multiplicityCurrentValue,
                isDataChangedToRefresh,
                activity.currentValues.multiplicityErrorValue
            )
        }
    }
}

@Composable
fun PlannedDoctorWithNumAndMultiplicity(
    activity: ActualActivity,
    isDataChangedToRefresh: MutableState<Boolean>,
    noOfDoctorCurrentValue: MutableState<IdAndNameObj>,
    multiplicityCurrentValue: MutableState<IdAndNameObj>,
) {
    Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(padding_4)) {
        Box(modifier = Modifier.weight(1F)) {
            PlannedSelectedDropDownMenu(
                activity.currentValues.doctorCurrentValue.embedded.name
            )
        }
        if (activity.currentValues.isNoOfDoctorVisible()) {
            Box(modifier = Modifier.weight(1F)) {
                SelectableDropDownMenu(
                    activity,
                    ActualCurrentValues.noOfDoctorList,
                    noOfDoctorCurrentValue,
                    isDataChangedToRefresh,
                    false
                )
            }
        }
        else {
            Box(modifier = Modifier.weight(1F)) {
                DisabledDropDownMenu(activity.currentValues.noOfDoctorCurrentValue.embedded.name)
            }
        }
    }
    Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(padding_2)) { // custom scenario (padding_2)
        Spacer(modifier = Modifier.weight(1F))
        Box(modifier = Modifier.weight(2F)) {
            SelectableDropDownMenu(
                activity,
                activity.currentValues.multiplicityList,
                multiplicityCurrentValue,
                isDataChangedToRefresh,
                activity.currentValues.multiplicityErrorValue
            )
        }
        Spacer(modifier = Modifier.weight(1F))
    }
}
