for i in *.txt 
do 
mv "$i" "$(echo ${i%.txt} | tr [:lower:] [:upper:]).txt"; 
done
