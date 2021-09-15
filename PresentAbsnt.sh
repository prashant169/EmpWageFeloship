#! /bin/bash
ranFun=$(( RANDOM%2 ))
if [[ $ranFun -eq 1 ]]

then

	echo "present"
else
	echo "Absent"
fi
