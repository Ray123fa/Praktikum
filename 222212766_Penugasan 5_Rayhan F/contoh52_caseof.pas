program contoh52;
uses crt;

var
	nilai: integer;
	grade: char;

begin
	clrscr;
	writeln('Input nilai yang didapat 0 s.d. 100!');
	write('Nilai: '); readln(nilai);

	case nilai of
		0..59: grade:='D';
		60..69: grade:='C';
		70..79: grade:='B';
		80..100: grade:='A';
		else grade:='F';
	end;

	if grade='F' then
		begin
			writeln('Anda salah input nilai');
			delay(2000);
			exit;
		end
	else writeln('Grade Anda: ', grade);

	case grade of
		'D': writeln('Kurang Memuaskan');
		'C': writeln('Cukup');
		'B': writeln('Baik');
		'A': writeln('Sangat Baik');
	end;
	readkey;
end.